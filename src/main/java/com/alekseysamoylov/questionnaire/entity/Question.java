package com.alekseysamoylov.questionnaire.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Сущность - простой вопрос пользователю
 */
@Data
@XmlRootElement
@Entity
public class Question {

    @Id
    private Long id;

    @Column
    private String eMail;

    @Column
    private String text;

    @Column
    private Integer rate;

    @Column
    private String comment;


}
