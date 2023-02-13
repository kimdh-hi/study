package com.toy.springdataenvers.domain

import com.toy.springdataenvers.domain.listener.UserJpaListener
import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator
import org.hibernate.envers.AuditOverride
import org.hibernate.envers.Audited
import org.hibernate.envers.NotAudited

@Entity
@Table(name = "tb_user")
@Audited
@AuditOverride(forClass = BaseEntity::class) // 상위 클래스까지 히스토리 테이블에 포함되도록
@EntityListeners(UserJpaListener::class)
class User(

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  var id: String? = null,

  var name: String,

  var age: Int = 1,
): BaseEntity() {

  @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL])
  @NotAudited
  val userSomeData1List: List<UserSomeData1> = listOf()
}