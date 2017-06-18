package com.alekseysamoylov.questionnaire.entity;

import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Организация, которой нужны отзывы
 */
@Data
@XmlRootElement
@Entity
public class Company {

    @Id
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "companyId")
    private List<Question> infoList = new ArrayList<>();
}
