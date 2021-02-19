package net.objecthunter.exp4j;

public class ExpressionValue {
    
    // 储存数据
    private Object data;
    
    // 只支持两种类型：double string
    private boolean isString;
    
    // 定义一些常量
    public static final ExpressionValue 
        TRUE = new ExpressionValue(1.0), 
        FALSE = new ExpressionValue(0.0),
        EMPTY_STRING = new ExpressionValue("");
    
        
    // 一些构造函数 及 工厂方法
    public ExpressionValue(double num) {
        this.isString = false;
        this.data = Double.valueOf(num);
    }
    
    public ExpressionValue(Double num) {
        this.isString = false;
        this.data = num;
    }
    
    public ExpressionValue(String str) {
        this.isString = true;
        this.data = str;
    }
    
    public ExpressionValue(char c) {
        this.isString = true;
        this.data = String.valueOf(c);
    }
    
    public static ExpressionValue valueOf(double num) {
        return new ExpressionValue(num);
    }
    

    public static ExpressionValue valueOf(Double num) {
        return new ExpressionValue(num);
    }
    

    public static ExpressionValue valueOf(String str) {
        if (str.equals("")) {
            return EMPTY_STRING;
        }
        return new ExpressionValue(str);
    }
    

    public static ExpressionValue valueOf(char c) {
        return new ExpressionValue(c);
    }
    
    // 各类型支持的操作符
    public ExpressionValue add(ExpressionValue that) {
        if (this.isString || this.isString) {
            return new ExpressionValue(this.data.toString().concat(that.data.toString()));
        }
        
        return new ExpressionValue(((Double) data) + ((Double) that.data));
    }
    
    public ExpressionValue sub(ExpressionValue that) {
        if (isString) {
            // unsupported
            throw new ArithmeticException("Unsupport operating!");
        }

        return new ExpressionValue(((Double) data) - ((Double) that.data));
    }
    
    public ExpressionValue mul(ExpressionValue that) {
        if (this.isString && !that.isString) {
            StringBuilder sb = new StringBuilder();
            String str = data.toString();
            int i = ((Double) that.data).intValue();
            for (;i > 0;i--) {
                sb.append(str);
            }
            return new ExpressionValue(sb.toString());
        }
        if (isString) {
            //unsupported
            throw new ArithmeticException("Unsupport operating!");
        }
        
        return new ExpressionValue(((Double) data) * ((Double) that.data));
    }
    
    public ExpressionValue div(ExpressionValue that) {
        if (isString) {
            // unsupported
            throw new ArithmeticException("Unsupport operating!");
        }

        if (((Double)that.data) == 0d) {
            throw new ArithmeticException("Division by zero!");
        }
        return new ExpressionValue(((Double) data) / ((Double) that.data));
    }
    
    public ExpressionValue unary_minus() {
        if (isString) {
            // unsupported
            throw new ArithmeticException("Unsupport operating!");
        }

        return new ExpressionValue(-((Double) data));
    }
    
    public ExpressionValue unary_plus() {
        if (isString) {
            // unsupported
            throw new ArithmeticException("Unsupport operating!");
        }

        return this;
    }
    
    public ExpressionValue power(ExpressionValue that) {
        if (isString) {
            // unsupported
            throw new ArithmeticException("Unsupport operating!");
        }

        return new ExpressionValue(Math.pow(((Double) data), ((Double) that.data)));
    }
    
    public ExpressionValue mod(ExpressionValue that) {
        if (isString) {
            // unsupported
            throw new ArithmeticException("Unsupport operating!");
        }

        if (((Double) data) == 0d) {
            throw new ArithmeticException("Division by zero!");
        }
        return new ExpressionValue(((Double) data) % ((Double) that.data));
    }
    
    // 
    public boolean isString() {
        return isString;
    }
    
    public Object getData() {
        return data;
    }
    
    public double getDouble() {
        if (isString) {
            // unsupported
            throw new ArithmeticException("Could not caSt to double!");
        }
        
        return (Double)data;
    }
    
    public String getString() {
        return data.toString();
    }

    @Override
    public String toString() {
        return data.toString();
    }
    
}
