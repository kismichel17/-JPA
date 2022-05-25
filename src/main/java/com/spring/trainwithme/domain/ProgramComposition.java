package com.spring.trainwithme.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "programs_composition")
public class ProgramComposition {

    @EmbeddedId
    private ProgramKey programKey;

    @Column(name = "amounts_of_sets")
    private int amountsOfSets;

    @Column(name = "amounts_of_repetition")
    private int amountsOfRepetition;


    @Embeddable
    public class ProgramKey implements Serializable{

        static final long serialVersionUID = 1L;

        @Column(name = "program_id")
        private Long programId;

        @Column(name = "exercise_id")
        private Long exerciseId;

        @Column(name = "number_training")
        private int numberTraining;

        public ProgramKey() {
        }

        public Long getProgramId() {
            return programId;
        }

        public void setProgramId(Long programId) {
            this.programId = programId;
        }

        public Long getExerciseId() {
            return exerciseId;
        }

        public void setExerciseId(Long exerciseId) {
            this.exerciseId = exerciseId;
        }

        public int getNumberTraining() {
            return numberTraining;
        }

        public void setNumberTraining(int numberTraining) {
            this.numberTraining = numberTraining;
        }

        @Override
        public String toString() {
            return "ProgramKey{" +
                    "programId=" + programId +
                    ", exerciseId=" + exerciseId +
                    ", numberTraining=" + numberTraining +
                    '}';
        }
    }


    public ProgramKey getProgramKey() {
        return programKey;
    }

    public void setProgramKey(ProgramKey programKey) {
        this.programKey = programKey;
    }

    public int getAmountsOfSets() {
        return amountsOfSets;
    }

    public void setAmountsOfSets(int amountsOfSets) {
        this.amountsOfSets = amountsOfSets;
    }

    public int getAmountsOfRepetition() {
        return amountsOfRepetition;
    }

    public void setAmountsOfRepetition(int amountsOfRepetition) {
        this.amountsOfRepetition = amountsOfRepetition;
    }
}
