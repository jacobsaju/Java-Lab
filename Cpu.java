/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpu;
public class Cpu {
    double price;
    class Processor{
        double cores;
        String manufacturer;
        double getCache(){
            return 4.3;
        }
    }
    protected class RAM{
        double memory;
        String manufacturer;
        double getClockSpeed(){
            return 5.5;
        }
    }
    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        Cpu.Processor processor = cpu.new Processor();
        Cpu.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
    }

  