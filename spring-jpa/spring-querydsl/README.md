## Spring QueryDsl


### OneToMany 컬렉션 목록조회 (+페이징)

### try1 - `엔티티 직접조회`
엔티티로 조회 후 메모리에서 조합하는 방식 <br/>
`distinct` 가 제대로 동작하기 때문에 페이징 가능 <br/>
메모리에서 작업하는 것이 부담스럽지만 페이징 단위 자체가 크지 않은 경우 크게 고려하지 않아도 될 듯 <br/>

연관관계가 없는 (id로 간접참조) 하고 있는 관계의 엔티티를 조회해야 하는 경우 사용 불가능한 방법<br/>
(`parent` 가 `singleChild` 엔티티를 id 로 간접참조하고 있는 경우..)<br/>

```kotlin
  override fun getAllV5(pageable: Pageable): Slice<CollectionProjectionParentResponseVO> {
    val result = query.selectDistinct(collectionProjectionParent)
      .from(collectionProjectionParent).distinct()
      .leftJoin(collectionProjectionParent.collectionProjectionChildren, collectionProjectionChild).fetchJoin()
      .limit(pageable.pageSize.toLong())
      .offset(pageable.offset)
      .fetch()
      .map { parent ->
        CollectionProjectionParentResponseVO(
          parent.id!!,
          parent.data1,
          parent.collectionProjectionChildren.map { child -> CollectionProjectionChildResponseVO.of(child) }
        )
      }
    

    return getSlice(result.toMutableList(), pageable)
  }
```

#### try2 - `transform`
leftJoin 에 의해 늘어난 row 때문에 페이징이 제대로 동작하지 않는다.<br/>
`distinct` 소용없다.<br/>
```kotlin
  override fun getAllV3(pageable: Pageable): Slice<CollectionProjectionParentResponseVO> {
    val result = query.from(collectionProjectionParent)
      .leftJoin(collectionProjectionParent.collectionProjectionChildren, collectionProjectionChild)//.distinct()
      .limit(pageable.pageSize.toLong())
      .offset(pageable.offset)
      .transform(
        groupBy(collectionProjectionParent)
          .list(
            QCollectionProjectionParentResponseVO(
              collectionProjectionParent.id,
              collectionProjectionParent.data1,
              list(
                QCollectionProjectionChildResponseVO(
                  collectionProjectionChild.id,
                  collectionProjectionChild.data2
                )
              )
            )
          )
      )

    return getSlice(result, pageable)
  }
```


### 참고
https://jojoldu.tistory.com/342