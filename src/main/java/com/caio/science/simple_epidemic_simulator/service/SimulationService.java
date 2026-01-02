package com.caio.science.simple_epidemic_simulator.service;

import com.caio.science.simple_epidemic_simulator.model.HealthStatus;
import com.caio.science.simple_epidemic_simulator.model.Person;
import com.caio.science.simple_epidemic_simulator.simulation.EpidemicSimulation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimulationService {

    public List<Person> runSimulation(
            int populationSize,
            double infectionRate,
            int recoveryDays,
            int days
    ) {
        // cria população
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < populationSize; i++) {
            Person p = new Person();
            p.setStatus(HealthStatus.SAUDAVEL);
            p.setDaysInfected(0);
            people.add(p);
        }

        // primeira pessoa infectada
        people.get(0).setStatus(HealthStatus.INFECTADO);

        EpidemicSimulation simulation =
                new EpidemicSimulation(infectionRate, recoveryDays);

        // roda por N dias
        for (int day = 1; day <= days; day++) {
            simulation.simulateDay(people);
        }

        return people;
    }
}