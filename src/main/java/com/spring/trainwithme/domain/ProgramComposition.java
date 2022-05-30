package com.spring.trainwithme.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "programs_composition")
public class ProgramComposition {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "number_training")
    private int numberTraining;

    @Column(name = "amounts_of_sets")
    private int amountsOfSets;

    @Column(name = "amounts_of_repetition")
    private int amountsOfRepetition;

    @ManyToOne
    @JoinColumn(name = "program_id")
    private Program program;

    @OneToOne(cascade = CascadeType.ALL)
    private Exercise exercise;
}