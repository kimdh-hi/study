package com.toy.springmvc.controller

import com.toy.springmvc.config.NoArg
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/multipartFileList")
class MultipartFileListTestController {

    @PostMapping(consumes = [MediaType.MULTIPART_FORM_DATA_VALUE])
    fun test(request: EmoticonSaveRequest): String {

        return "ok"
    }
}

@NoArg
data class EmoticonSaveRequest(
    val i18ns: MutableList<EmoticonI18nRequest> = mutableListOf()
)

@NoArg
data class EmoticonI18nRequest(
    var name: String,
    var representativeFile: MultipartFile,
    var emoticonFiles: MutableList<MultipartFile> = mutableListOf()
)