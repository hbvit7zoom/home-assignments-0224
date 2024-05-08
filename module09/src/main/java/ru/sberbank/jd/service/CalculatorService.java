package ru.sberbank.jd.service;

import ru.sberbank.jd.controller.input.SumInput;
import ru.sberbank.jd.controller.output.SumOutput;
import ru.sberbank.jd.model.Operation;
import ru.sberbank.jd.repository.CalculatorRepository;
import ru.sberbank.jd.repository.InMemoryCalculatorRepositoryImpl;

public class CalculatorService {
    private CalculatorRepository calculatorRepository;

    public CalculatorService() {
        this.calculatorRepository = new InMemoryCalculatorRepositoryImpl();
    }

    public SumOutput sum(SumInput si) {
        SumOutput sumOutput = new SumOutput(si.value1() + si.value2());
        Operation op = Operation.builder()
                .sumInput(si)
                .result(String.valueOf(sumOutput.result()))
                .build();
        Operation resultOp = calculatorRepository.save(op);

        System.out.println("Operation sum was calculated, result is " + sumOutput.result() + "; operation saved = " + resultOp);
        return sumOutput;
    }
}
