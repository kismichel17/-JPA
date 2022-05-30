package com.spring.trainwithme.domain;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class ProgramCompositionId implements Serializable {

    static final long serialVersionUID = 1L;

    private Program programId;

    private Long exerciseId;

    private int numberTraining;

    public ProgramCompositionId() {
    }

    public ProgramCompositionId(Program programId, Long exerciseId, int numberTraining) {
        this.programId = programId;
        this.exerciseId = exerciseId;
        this.numberTraining = numberTraining;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramCompositionId that = (ProgramCompositionId) o;
        return numberTraining == that.numberTraining && programId.equals(that.programId) && exerciseId.equals(that.exerciseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(programId, exerciseId, numberTraining);
    }
}
