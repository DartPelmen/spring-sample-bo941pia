package edu.festu.ivankuznetsov.springsamplebo941pia.service

import edu.festu.ivankuznetsov.springsamplebo941pia.entity.ScoreEntity

/**
 * описание сервиса по работе с оценками
 * */
interface ScoreService {
    fun getAll(): MutableList<ScoreEntity>
}
