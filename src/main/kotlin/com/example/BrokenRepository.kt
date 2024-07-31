package com.example

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import kotlinx.coroutines.flow.Flow

@Repository
interface BrokenRepository : CoroutineCrudRepository<DataEntity, Long> {

    // To "fix" the KSP issue, you have to define the inherited functions again
    // override fun findAll(): Flow<DataEntity>
    // override suspend fun <S : DataEntity> save(entity: S): S
}
