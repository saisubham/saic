package com.sudosai.saic;

import java.util.List;

interface SaicCallable {
    // size of argument list
    int arity();

    Object call(Interpreter interpreter, List<Object> arguments);
}
