package advancejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class fibnocci
{

    public static void main(String[] args) {

        Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}).limit(15).map(n -> n[0]).forEach(fibNum -> System.out.print(fibNum + " "));
    }
    }
