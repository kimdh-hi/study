package com.lecture.issueservice.service

import com.lecture.issueservice.domain.Issue
import com.lecture.issueservice.domain.enums.IssueStatus
import com.lecture.issueservice.model.IssueRequest
import com.lecture.issueservice.model.IssueResponse
import com.lecture.issueservice.repository.IssueRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class IssueService(
  private val issueRepository: IssueRepository
) {

  @Transactional
  fun create(userId: Long, request: IssueRequest): IssueResponse {
    val issue = Issue(
      summary = request.summary,
      description = request.description,
      userId = userId,
      type = request.type,
      priority = request.priority,
      status = request.status
    )
    return IssueResponse(issueRepository.save(issue))
  }

  fun getAll(status: IssueStatus): List<IssueResponse> {
    return issueRepository.findAllByStatusOrderByCreatedAtDesc(status)
      .map { IssueResponse(it) }
  }

  fun get(issueId: Long): IssueResponse {
    val issue = issueRepository.findByIdOrNull(issueId) ?: throw NotFoundException()
    return IssueResponse(issue)
  }
}