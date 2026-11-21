package clinic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public final class Doctor {

    @EqualsAndHashCode.Include
    protected final String name;

    protected final Department department;

    protected final int experience;

    protected final String room;

    protected final boolean onCall;

    @ToString.Exclude
    protected final List<Patient> patients;

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
    @ToString
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    public static final class Patient {

        @EqualsAndHashCode.Include
        protected final long insuranceNumber;

        protected final String name;

        protected final int age;
    }

    public enum Department {
        @JsonProperty("Cardiology") CARDIOLOGY,
        @JsonProperty("Neurology") NEUROLOGY,
        @JsonProperty("Pediatrics") PEDIATRICS,
        @JsonProperty("Orthopedics") ORTHOPEDICS,
        @JsonProperty("Dermatology") DERMATOLOGY
    }
}
