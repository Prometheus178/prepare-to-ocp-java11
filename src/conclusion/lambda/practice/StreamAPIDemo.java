package conclusion.lambda.practice;


import conclusion.lambda.practice.model.Specialist;
import conclusion.lambda.practice.model.Specialty;
import conclusion.lambda.practice.util.OldApproachUtil;
import conclusion.lambda.practice.util.StreamAPIUtil;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;


public class StreamAPIDemo {
    public static void main(String[] args) {
//         List<Specialist> specialists = OldApproachUtil.getSpecialists();
        List<Specialist> specialists = StreamAPIUtil.getSpecialists();

//        specialists.add(new Specialist("Test", new BigDecimal("100"),Specialty.ENGINEER));
        specialists.forEach( specialist -> {
            System.out.println(specialist);
        });

         System.out.println("Filter");
//          List<Specialist> engineers = OldApproachUtil.filterBySpecialty(specialists, Specialty.ENGINEER);
          List<Specialist> engineers = StreamAPIUtil.filterBySpecialty(specialists, Specialty.ENGINEER);
        StreamAPIUtil.printSpecialists(engineers);

//       System.out.println("Sorting");
//        specialists.sort(Comparator.comparing(Specialist::getName)); // отсортирует изменив порядок в коллекции
//        List<Specialist> sortedSpecialistsAsc = StreamAPIUtil.sortSpecialistsByNameAsc(specialists); // вернет новую отсортированную коллекцию
//        List<Specialist> sortedSpecialistsDesc = StreamAPIUtil.sortSpecialistsByNameDesc(specialists);
//        StreamAPIUtil.printSpecialists(specialists);
//        StreamAPIUtil.printSpecialists(sortedSpecialistsAsc);
//        StreamAPIUtil.printSpecialists(sortedSpecialistsDesc);

//        System.out.println("Max salary");//
//        Specialist withMaxSalary = StreamAPIUtil.findWithMaxSalary(specialists);
//        System.out.println(withMaxSalary);
//        System.out.println("Min salary"); //
//        Specialist withMinSalary = StreamAPIUtil.findWithMinSalary(specialists);
//        System.out.println(withMinSalary);

//        System.out.println("Grouping");//
//        Map<Specialty, List<Specialist>> groupedBySpecialty = StreamAPIUtil.groupBySpecialty(specialists);
//        // Map<Specialty, List<Specialist>> groupedBySpecialty = OldApproachUtil.groupBySpecialty(specialists);
//        System.out.println(groupedBySpecialty);

//        System.out.println("All engineers");//
////        boolean allEngineers = OldApproachUtil.matchAllEngineers(specialists);
//        boolean allEngineers = StreamAPIUtil.matchAllEngineers(specialists);
//        System.out.println(allEngineers);
////
//        System.out.println("Any engineers");//
////        boolean anyEngineer = OldApproachUtil.matchAnyEnginner(specialists);
//        boolean anyEngineer = StreamAPIUtil.matchAnyEngineer(specialists);
//        System.out.println(anyEngineer);
//
//        System.out.println("All salary more then");//
////        boolean allSalaryMoreThen1000 = OldApproachUtil.matchAllSalaryMoreThen(specialists, new BigDecimal(10000));
//        boolean allSalaryMoreThen1000 = StreamAPIUtil.matchAllSalaryMoreThen(specialists, new BigDecimal(10000));
//        System.out.println(allSalaryMoreThen1000);
//
//        System.out.println("No one with salary more then");//
////        boolean noOneWithSalaryMoreThen10000 = OldApproachUtil.matchNoneSalaryMoreThen(specialists, new BigDecimal(10000));
//        boolean noOneWithSalaryMoreThen10000 = StreamAPIUtil.matchNoneSalaryMoreThen(specialists, new BigDecimal(10000));
//        System.out.println(noOneWithSalaryMoreThen10000);
    }
}