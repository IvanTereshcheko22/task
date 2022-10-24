package taskhome.taskhome2;

public class Main {
    public static byte globalVarByte =12 ;
    public static int globalVarInt = 1000000;
    public static double globalVarDouble = 1.001d;
    public static char globalVarChar = 'a';

    public static Byte globalWrapByte = 20;
    public static Integer globalWrapInteger = 10000000;
    public static Double globalWrapDouble = 1.002d;
    public static Character globalWrapCharacter = 'b';

    public static void main(String[] args) {
        short localVarShort = 127;
        long localVarLong = 1000000000000L;
        float localVarFloat = 2.5f;
        boolean localVarBoolean = true;

        Short localWrapShort = 200;
        Long localWrapLong = 110000000000L;
        Float localWrapFloat = 45.6f;
        Boolean localWrapBoolean = true;

        task2 globalVariables = new task2();
        globalVariables.setVarByte((byte) 100);
        globalVariables.getVarByte();
        globalVariables.setVarShort((short) 1000);
        globalVariables.getVarShort();
        globalVariables.setVarInt(1000000);
        globalVariables.getVarInt();
        globalVariables.setVarLong(10000000000L);
        globalVariables.getVarLong();
        globalVariables.setVarFloat(1.1f);
        globalVariables.getVarFloat();
        globalVariables.setVarDouble(1.12d);
        globalVariables.getVarDouble();
        globalVariables.setVarChar('с');
        globalVariables.getVarChar();
        globalVariables.setVarBoolean(true);
        globalVariables.getVarBoolean();

        task2 globalWrappers = new task2();
        globalWrappers.setWrapByte((byte) 120);
        globalVariables.getWrapByte();
        globalWrappers.setWrapShort((short) 10001);
        globalWrappers.getWrapShort();
        globalWrappers.setWrapInteger(1000000001);
        globalWrappers.getWrapInteger();
        globalWrappers.setWrapLong(100000000000001L);
        globalWrappers.getWrapLong();
        globalWrappers.setWrapFloat(111.1f);
        globalWrappers.getWrapFloat();
        globalWrappers.setWrapDouble(1111.0001);
        globalWrappers.getWrapDouble();
        globalWrappers.setWrapCharacter('d');
        globalWrappers.getWrapCharacter();
        globalWrappers.setWrapBoolean(false);
        globalWrappers.getWrapBoolean();

        System.out.println("Global variable byte from first class: " + globalVarByte);
        System.out.println("Global variable int from first class: " + globalVarInt);
        System.out.println("Global variable double from first class: " + globalVarDouble);
        System.out.println("Global variable char from first class: " + globalVarChar);
        System.out.println();

        System.out.println("Global wrapper Byte from first class: " + globalWrapByte);
        System.out.println("Global wrapper Integer from first class: " + globalWrapInteger);
        System.out.println("Global wrapper Double from first class: " + globalWrapDouble);
        System.out.println("Global wrapper Character from first class: " + globalWrapCharacter);
        System.out.println();

        System.out.println("Local variable short: " + localVarShort);
        System.out.println("Local variable long: " + localVarLong);
        System.out.println("Local variable float: " + localVarFloat);
        System.out.println("Local variable boolean: " + localVarBoolean);
        System.out.println();

        System.out.println("Local wrapper Short: " + localWrapShort);
        System.out.println("Local wrapper Long: " + localWrapLong);
        System.out.println("Local wrapper Float: " + localWrapFloat);
        System.out.println("Local wrapper Boolean: " + localWrapBoolean);
        System.out.println();

        System.out.println("Global variable byte from second class: " + globalVariables.getVarByte());
        System.out.println("Global variable short from second class: " + globalVariables.getVarShort());
        System.out.println("Global variable int from second class: " + globalVariables.getVarInt());
        System.out.println("Global variable long from second class: " + globalVariables.getVarLong());
        System.out.println("Global variable float from second class: " + globalVariables.getVarFloat());
        System.out.println("Global variable double from second class: " + globalVariables.getVarDouble());
        System.out.println("Global variable char from second class: " + globalVariables.getVarChar());
        System.out.println("Global variable boolean from second class: " + globalVariables.getVarBoolean());
        System.out.println();

        System.out.println("Global wrapper Byte from second class: " + globalWrappers.getWrapByte());
        System.out.println("Global wrapper Short from second class: " + globalWrappers.getWrapShort());
        System.out.println("Global wrapper Integer from second class: " + globalWrappers.getWrapInteger());
        System.out.println("Global wrapper Long from second class: " + globalWrappers.getWrapLong());
        System.out.println("Global wrapper Float from second class: " + globalWrappers.getWrapFloat());
        System.out.println("Global wrapper Double from second class: " + globalWrappers.getWrapDouble());
        System.out.println("Global wrapper Character from second class: " + globalWrappers.getWrapCharacter());
        System.out.println("Global wrapper Boolean from second class: " + globalWrappers.getWrapBoolean());
    }
}