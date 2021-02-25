//public class Teacher3 {
//    public String name;
//    public int age;
//
//    public Teacher3(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public void show(){
//        System.out.println("姓名:"+ name + "   年龄:"+ age);
//    }
//
//    @Override
//    public String toString() {
//        return "Teacher3{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
public class myDate1 {
    public int year;
    public int month;
    public int day;

    public myDate1(int year, int month, int day) {
        if (year < 1000 || year > 3000) {
            RuntimeException rte = new RuntimeException("year参数异常！！！");
            throw rte;
        }
        if (month < 1 || month > 12) {
            throw new RuntimeException("month参数异常！！");
        }
        if (day < 1 || day > judgeDay(year, month)) {
            throw new RuntimeException("day参数异常！");
        }

        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "myDate1{" +
                "year=" + year +
                ", month=" + month +
                ", date=" + day +
                '}';
    }

    public int 相差天数(myDate1 from) {
        if(this.judgeRange(from) <= 0){
            throw new RuntimeException("from 的日期必须当前日期之前");
        }

        int count = 0;
        while(from.judgeRange(this) < 0){

            from.increment();
            count ++;

        }
        return count;
    }

    public void increment(){
        day ++;
        if(day <= judgeDay(year, month)){
            return;
        }
        month ++;
        day = 1;
        if (month <= 12){
            return;
        }
        year ++;
        month = 1;
    }


//    public int judgeRange(myDate1 from) {
//        if (year < from.year) {
//            return -1;
//        } else if (year == from.year) {
//            if (month < from.month) {
//                return -1;
//            } else if (month == from.month) {
//                if (day < from.day) {
//                    return -1;
//                } else if (day == from.day) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            } else {
//                return 1;
//            }
//        } else {
//            return 1;
//        }
//    }

    public int judgeRange(myDate1 from) {
//        if (year != from.year){
//            System.out.print("year range:");
//            return year - from.year;
//        }else {
//            if (month != from.month){
//                return month - from.month;
//            }else {
//                if (day != from.day){
//                    return day - from.day;
//                }
//            }
//        }
//        return 0;
        // this 和 from 在进行比较

        if (year != from.year) {
//            if (year > from.year) {
//                return 1;
//            } else {
//                return -1;
//            }
            return year - from.year;    // year > from.year => 正数；否则 负数
        }

        // 说明 year == from.year
        if (month != from.month) {
            return month - from.month;
        }

        // 说明 year == from.year && month == from.month
        return day - from.day;
    }

    public int judgeDay(int year, int month) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }

    public boolean isLeapYear(int year) {
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }


}