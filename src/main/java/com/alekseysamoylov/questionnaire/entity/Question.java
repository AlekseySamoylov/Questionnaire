package com.alekseysamoylov.questionnaire.entity;

import lombok.Data;

/**
 * Сущность - простой вопрос пользователю
 */
@Data
public class Question {

    private Long id;

    private String eMail;

    private String text;

    private Integer rate;

    private String comment;


}
