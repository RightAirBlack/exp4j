/* 
* Copyright 2014 Frank Asseg
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License. 
*/
package net.objecthunter.exp4j.function;
import net.objecthunter.exp4j.*;

/**
 * Class representing the builtin functions available for use in expressions
 */
public class Functions {
    private static final int INDEX_SIN = 0;
    private static final int INDEX_COS = 1;
    private static final int INDEX_TAN = 2;
    private static final int INDEX_COT = 3;
    private static final int INDEX_LOG = 4;
    private static final int INDEX_LOG1P = 5;
    private static final int INDEX_ABS = 6;
    private static final int INDEX_ACOS = 7;
    private static final int INDEX_ASIN = 8;
    private static final int INDEX_ATAN = 9;
    private static final int INDEX_CBRT = 10;
    private static final int INDEX_CEIL = 11;
    private static final int INDEX_FLOOR = 12;
    private static final int INDEX_SINH = 13;
    private static final int INDEX_SQRT = 14;
    private static final int INDEX_TANH = 15;
    private static final int INDEX_COSH = 16;
    private static final int INDEX_POW = 17;
    private static final int INDEX_EXP = 18;
    private static final int INDEX_EXPM1 = 19;
    private static final int INDEX_LOG10 = 20;
    private static final int INDEX_LOG2 = 21;
    private static final int INDEX_SGN = 22;

    private static final Function[] builtinFunctions = new Function[23];

    static {
        builtinFunctions[INDEX_SIN] = new Function("sin") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.sin(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_COS] = new Function("cos") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.cos(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_TAN] = new Function("tan") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.tan(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_COT] = new Function("cot") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                double tan = Math.tan(args[0].getDouble());
                if (tan == 0d) {
                    throw new ArithmeticException("Division by zero in cotangent!");
                }
                return ExpressionValue.valueOf(1d/tan);
            }
        };
        builtinFunctions[INDEX_LOG] = new Function("log") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.log(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_LOG2] = new Function("log2") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.log(args[0].getDouble()) / Math.log(2d));
            }
        };
        builtinFunctions[INDEX_LOG10] = new Function("log10") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.log10(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_LOG1P] = new Function("log1p") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.log1p(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_ABS] = new Function("abs") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.abs(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_ACOS] = new Function("acos") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.acos(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_ASIN] = new Function("asin") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.asin(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_ATAN] = new Function("atan") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.atan(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_CBRT] = new Function("cbrt") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.cbrt(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_FLOOR] = new Function("floor") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.floor(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_SINH] = new Function("sinh") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.sinh(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_SQRT] = new Function("sqrt") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.sqrt(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_TANH] = new Function("tanh") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.tanh(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_COSH] = new Function("cosh") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.cosh(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_CEIL] = new Function("ceil") {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.ceil(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_POW] = new Function("pow", 2) {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                return args[0].power(args[1]);
            }
        };
        builtinFunctions[INDEX_EXP] = new Function("exp", 1) {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.exp(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_EXPM1] = new Function("expm1", 1) {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.expm1(args[0].getDouble()));
            }
        };
        builtinFunctions[INDEX_SGN] = new Function("signum", 1) {
            @Override
            public ExpressionValue apply(ExpressionValue... args) {
                if (args[0].isString()) {
                    // unsupported
                    throw new ArithmeticException("Unsupport operating!");
                }
                return ExpressionValue.valueOf(Math.signum(args[0].getDouble()));
                /*if (args[0] > 0) {
                    return 1;
                } else if (args[0] < 0) {
                    return -1;
                } else {
                    return 0;
                }*/
            }
        };
    }

    /**
     * Get the builtin function for a given name
     * @param name te name of the function
     * @return a Function instance
     */
    public static Function getBuiltinFunction(final String name) {

        if (name.equals("sin")) {
            return builtinFunctions[INDEX_SIN];
        } else if (name.equals("cos")) {
            return builtinFunctions[INDEX_COS];
        } else if (name.equals("tan")) {
            return builtinFunctions[INDEX_TAN];
        } else if (name.equals("cot")) {
            return builtinFunctions[INDEX_COT];
        } else if (name.equals("asin")) {
            return builtinFunctions[INDEX_ASIN];
        } else if (name.equals("acos")) {
            return builtinFunctions[INDEX_ACOS];
        } else if (name.equals("atan")) {
            return builtinFunctions[INDEX_ATAN];
        } else if (name.equals("sinh")) {
            return builtinFunctions[INDEX_SINH];
        } else if (name.equals("cosh")) {
            return builtinFunctions[INDEX_COSH];
        } else if (name.equals("tanh")) {
            return builtinFunctions[INDEX_TANH];
        } else if (name.equals("abs")) {
            return builtinFunctions[INDEX_ABS];
        } else if (name.equals("log")) {
            return builtinFunctions[INDEX_LOG];
        } else if (name.equals("log10")) {
            return builtinFunctions[INDEX_LOG10];
        } else if (name.equals("log2")) {
            return builtinFunctions[INDEX_LOG2];
        } else if (name.equals("log1p")) {
            return builtinFunctions[INDEX_LOG1P];
        } else if (name.equals("ceil")) {
            return builtinFunctions[INDEX_CEIL];
        } else if (name.equals("floor")) {
            return builtinFunctions[INDEX_FLOOR];
        } else if (name.equals("sqrt")) {
            return builtinFunctions[INDEX_SQRT];
        } else if (name.equals("cbrt")) {
            return builtinFunctions[INDEX_CBRT];
        } else if (name.equals("pow")) {
            return builtinFunctions[INDEX_POW];
        } else if (name.equals("exp")) {
            return builtinFunctions[INDEX_EXP];
        } else if (name.equals("expm1")) {
            return builtinFunctions[INDEX_EXPM1];
        } else if (name.equals("signum")) {
            return builtinFunctions[INDEX_SGN];
        } else {
            return null;
        }
    }

}
