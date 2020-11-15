package com.lessons.igor.enums.ex004;

public enum Company {
    GOOGLE(5555) {
        @Override
        public String getCurrency() {
            return "Dollars";
        }

        @Override
        public int getValue() {
            return 10 + this.value;
        }
    },
    YANDEX(444) {
        @Override
        public String getCurrency() {
            return "RUB";
        }
    },
    YUAHU(333) {
        @Override
        public String toString() {
            return "Company" + super.toString();
        }

        @Override
        public String getCurrency() {
            return "Cent";
        }
    };

    int value;

    Company(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Company " + super.toString() + ", salary = " + getValue() + " " + getCurrency();
    }

    public int getValue() {
        return value;
    }

    public abstract String getCurrency();
}
