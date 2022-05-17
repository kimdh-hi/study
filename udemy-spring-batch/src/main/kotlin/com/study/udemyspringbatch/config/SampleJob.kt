package com.study.udemyspringbatch.config

import com.study.udemyspringbatch.service.SecondTasklet
import org.springframework.batch.core.Job
import org.springframework.batch.core.Step
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.batch.core.step.tasklet.Tasklet
import org.springframework.batch.repeat.RepeatStatus
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SampleJob(val jbf: JobBuilderFactory, val sbf: StepBuilderFactory,
    val secondTasklet: SecondTasklet) {

    @Bean
    fun firstJob(): Job {
        return jbf.get("First Job Name")
            .start(firstStep())
            .next(secondStep()) // start -> next -> next ... sequential
            .build()
    }

    private fun firstStep(): Step {
        return sbf.get("First Step Name")
            .tasklet(firstTasklet())
            .build()
    }

    private fun firstTasklet(): Tasklet {
        return Tasklet { contribution, chunkContext ->
            println("First Tasklet step")
            RepeatStatus.FINISHED
        }
    }

    private fun secondStep(): Step {
        return sbf.get("Second Step Name")
            .tasklet(secondTasklet)
            .build()
    }

//    private fun secondTasklet(): Tasklet {
//        return Tasklet { contribution, chunkContext ->
//            println("Second Tasklet step")
//            RepeatStatus.FINISHED
//        }
//    }
}