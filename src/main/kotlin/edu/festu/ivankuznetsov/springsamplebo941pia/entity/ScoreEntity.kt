package edu.festu.ivankuznetsov.springsamplebo941pia.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


/**
 * описание сущности БД
 * */
@Entity
data class ScoreEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,

    var lesson: String = "",

    var score: Int = 0
)
