package ru.clevertec.check.application.ports.output;

import ru.clevertec.check.domain.model.entity.Check;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;

public interface CheckOutputPort {
    Check persist(Check check) throws InvocationTargetException, IllegalAccessException, IOException, URISyntaxException;


}
