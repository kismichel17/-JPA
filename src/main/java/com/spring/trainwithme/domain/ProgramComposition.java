package com.spring.trainwithme.domain;

import javax.persistence.*;

@Entity
@Table(name = "programs_composition")
@IdClass(ProgramCompositionId.class)
public class ProgramComposition {

    @Id
    @Column(name = "program_id")
    private Long programId;

    @Id
    @Column(name = "exercise_id")
    private Long exerciseId;

    @Id
    @Column(name = "number_training")
    private int numberTraining;

    @Column(name = "amounts_of_sets")
    private int amountsOfSets;

    @Column(name = "amounts_of_repetition")
    private int amountsOfRepetition;

    @ManyToOne
    @MapsId
    @JoinColumn(name = "program_id")
    private Program program;


//    @Embeddable
//    public static class ProgramKey implements Serializable{
//
//        static final long serialVersionUID = 1L;
//
//        @Column(name = "program_id")
//        private Long programId;
//
//        @Column(name = "exercise_id")
//        private Long exerciseId;
//
//        @Column(name = "number_training")
//        private int numberTraining;
//
//
//        public ProgramKey(Long programId, int numberTraining) {
//            this.programId = programId;
//            this.numberTraining = numberTraining;
//        }
//
//        public ProgramKey() {
//        }
//
//        public Long getProgramId() {
//            return programId;
//        }
//
//        public void setProgramId(Long programId) {
//            this.programId = programId;
//        }
//
//        public Long getExerciseId() {
//            return exerciseId;
//        }
//
//        public void setExerciseId(Long exerciseId) {
//            this.exerciseId = exerciseId;
//        }
//
//        public int getNumberTraining() {
//            return numberTraining;
//        }
//
//        public void setNumberTraining(int numberTraining) {
//            this.numberTraining = numberTraining;
//        }
//
//        @Override
//        public String toString() {
//            return "ProgramKey{" +
//                    "programId=" + programId +
//                    ", exerciseId=" + exerciseId +
//                    ", numberTraining=" + numberTraining +
//                    '}';
//        }
//    }
//
//    public ProgramKey getProgramKey() {
//        return programKey;
//    }
//
//    public void setProgramKey(ProgramKey programKey) {
//        this.programKey = programKey;
//    }


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

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
}
