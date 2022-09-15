package edu.festu.ivankuznetsov.springsamplebo941pia.repository

import edu.festu.ivankuznetsov.springsamplebo941pia.entity.ScoreEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * описание репозитория оценок (паттерн Repository)
 * */
@Repository
interface ScoreRepository: JpaRepository<ScoreEntity, Long>
