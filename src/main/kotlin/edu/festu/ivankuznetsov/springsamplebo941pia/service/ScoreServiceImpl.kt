package edu.festu.ivankuznetsov.springsamplebo941pia.service

import edu.festu.ivankuznetsov.springsamplebo941pia.entity.ScoreEntity
import edu.festu.ivankuznetsov.springsamplebo941pia.repository.ScoreRepository
import org.springframework.stereotype.Service

/**
 * реализация сервиса по работе с оценками
 * */
@Service
class ScoreServiceImpl(private val scoreRepository: ScoreRepository):ScoreService {

    override fun getAll(): MutableList<ScoreEntity> {
        return scoreRepository.findAll()
    }
}
