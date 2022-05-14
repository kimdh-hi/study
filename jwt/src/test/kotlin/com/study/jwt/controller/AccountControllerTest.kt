package com.study.jwt.controller

import com.study.jwt.base.AbstractIntegrationTest
import com.study.jwt.base.TestData
import com.study.jwt.vo.LoginRequestVO
import com.study.jwt.vo.SignupRequestVO
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.post

internal class AccountControllerTest(): AbstractIntegrationTest() {

    @DisplayName("회원가입 테스트")
    @Nested
    inner class SignupTest {

        @Test
        fun `회원가입 성공`() {
            //given
            val signupRequestVO = SignupRequestVO("testUser", "testPassword")

            //when
            val result = mockMvc.post("/accounts/signup") {
                contentType = MediaType.APPLICATION_JSON
                content = objectMapper.writeValueAsString(signupRequestVO)
            }

            //then
            result.andExpect { status { isOk() } }
            val account = accountRepository.findByUsername("testUser")
            assertAll({
                assertNotNull(account)
                assertEquals(TestData.ROLE_USER_ID, account?.role?.id)
            })
        }
    }

    @DisplayName("username / password 로그인 테스트")
    @Nested
    inner class LoginTest {

        @Test
        fun `로그인 성공 - 토큰 발급`() {
            //given
            val loginRequestVO =
                LoginRequestVO(username = TestData.ACCOUNT_ADMIN_USERNAME, password = TestData.ACCOUNT_ADMIN_PASSWORD)

            //when
            val result = mockMvc.post("/accounts/login") {
                contentType = MediaType.APPLICATION_JSON
                content = objectMapper.writeValueAsString(loginRequestVO)
            }.andDo { print() }

            //then
            result.andExpect {
                status { isOk() }
                jsonPath("$.token") { exists() }
            }
        }
    }

    @DisplayName("회원가입 후 토큰발급 테스트")
    @Nested
    inner class SignupLoginTest {
        @Test
        fun `로그인 성공 - 토큰 발급`() {
            //given
            val username = "testUser"
            val password = "testUser"
            val signupRequestVO = SignupRequestVO(username, password)

            //when
            val signupResult = mockMvc.post("/accounts/signup") {
                contentType = MediaType.APPLICATION_JSON
                content = objectMapper.writeValueAsString(signupRequestVO)
            }

            //then
            signupResult.andExpect { status { isOk() } }
            val account = accountRepository.findByUsername(username)
            assertAll({
                assertNotNull(account)
                assertEquals(TestData.ROLE_USER_ID, account?.role?.id)
            })

            //given
            val loginRequestVO =
                LoginRequestVO(username = username, password = password)

            //when
            val loginResult = mockMvc.post("/accounts/login") {
                contentType = MediaType.APPLICATION_JSON
                content = objectMapper.writeValueAsString(loginRequestVO)
            }.andDo { print() }

            //then
            loginResult.andExpect {
                status { isOk() }
                jsonPath("$.token") { exists() }
            }
        }
    }
}