package com.toy.springquerydsl.domain

import com.querydsl.core.annotations.QueryProjection
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "tb_case_test_entity_1")
class CaseTestEntity1(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,

  val data: String,

  val otherCaseTestEntityId: Long,

  @Enumerated(EnumType.STRING)
  val caseTestEntityType: CaseTestEntityType
)

enum class CaseTestEntityType {
  TYPE1, TYPE2, TYPE3
}

@Entity
@Table(name = "tb_case_test_entity_2")
class CaseTestEntity2(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,

  val data: String,
)

@Entity
@Table(name = "tb_case_test_entity_3")
class CaseTestEntity3(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,

  val data: String,
)

data class CaseTestResponseVO @QueryProjection constructor(
  val caseTestEntity1Id: Long?,
  val caseTestEntityType: CaseTestEntityType,

  val data: String?
)
