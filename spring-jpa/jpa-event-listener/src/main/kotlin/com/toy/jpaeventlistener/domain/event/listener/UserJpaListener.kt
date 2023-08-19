package com.toy.jpaeventlistener.domain.event.listener

import com.toy.jpaeventlistener.domain.User
import com.toy.jpaeventlistener.domain.UserParticipantRepository
import jakarta.persistence.PreRemove
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Component

@Component
class UserJpaListener {

  @Autowired
  @Lazy
  lateinit var userParticipantRepository: UserParticipantRepository

  private val log = LoggerFactory.getLogger(javaClass)

  @PreRemove
  fun postRemove(user: User) {
    log.info("postRemove user: {}", user)
    userParticipantRepository.findByUserId(user.id!!)?.let {
      userParticipantRepository.delete(it)
    }
  }
}