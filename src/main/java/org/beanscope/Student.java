package org.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// bean scope using annotation
@Component("ob")
@Scope("prototype") // by default singleton
public class Student {
}
