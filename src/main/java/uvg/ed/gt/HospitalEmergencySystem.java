package uvg.ed.gt;

import java.util.PriorityQueue;

public class HospitalEmergencySystem {

    public static void main(String[] args) {
        // Crear una cola de prioridad para pacientes
        PriorityQueue<Patient> emergencyQueue = new PriorityQueue<>();

        // Agregar pacientes a la cola de emergencia
        emergencyQueue.add(new Patient("Juan Perez", "fractura de pierna", 'C'));
        emergencyQueue.add(new Patient("Maria Ramirez", "apendicitis", 'A'));
        emergencyQueue.add(new Patient("Lorenzo Toledo", "chikunguya", 'E'));
        emergencyQueue.add(new Patient("Carmen Sarmientos", "dolores de parto", 'B'));

        // Atender pacientes en orden de prioridad
        while (!emergencyQueue.isEmpty()) {
            Patient nextPatient = emergencyQueue.poll();
            System.out.println(nextPatient);
        }
    }

    static class Patient implements Comparable<Patient> {
        private String name;
        private String symptom;
        private char priority;

        public Patient(String name, String symptom, char priority) {
            this.name = name;
            this.symptom = symptom;
            this.priority = priority;
        }

        public String getName() {
            return name;
        }

        public String getSymptom() {
            return symptom;
        }

        public char getPriority() {
            return priority;
        }

        @Override
        public int compareTo(Patient other) {
            return Character.compare(this.priority, other.priority);
        }

        @Override
        public String toString() {
            return name + ", " + symptom + ", " + priority;
        }
    }
}

