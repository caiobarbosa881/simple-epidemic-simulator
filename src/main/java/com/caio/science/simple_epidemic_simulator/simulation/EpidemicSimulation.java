package com.caio.science.simple_epidemic_simulator.simulation;

import com.caio.science.simple_epidemic_simulator.model.HealthStatus;
import com.caio.science.simple_epidemic_simulator.model.Person;

import java.util.List;
import java.util.Random;

public class EpidemicSimulation {

    private final double infectionRate; // Ex: 0.3 = 30%
    private final int recoveryDays;

    public EpidemicSimulation(double infectionRate, int recoveryDays) {
        this.infectionRate = infectionRate;
        this.recoveryDays = recoveryDays;
    }

    // Simula 1 dia
    public void simulateDay(List<Person> people) {
        Random random = new Random();

        for (Person person : people) {

            if (person.getStatus() == HealthStatus.INFECTADO) {

                // aumenta o tempo de infecção
                person.setDaysInfected(person.getDaysInfected() + 1);

                // tenta infectar pessoas saudáveis
                for (Person other : people) {
                    if (other.getStatus() == HealthStatus.SAUDAVEL) {
                        if (random.nextDouble() < infectionRate) {
                            other.setStatus(HealthStatus.INFECTADO);
                        }
                    }
                }

                // verifica se já pode se recuperar
                if (person.getDaysInfected() >= recoveryDays) {
                    person.setStatus(HealthStatus.RECUPERADO);
                }
            }
        }
    }
}