import java.util.*;
public class Level1 {
    public static int PrintingCosts (String Line) {
        HashMap <Character, Integer> map  = new HashMap<>();
        int sumOfToner = 0;
        map.put(' ',   0); map.put('!',   9); map.put('"',   6); map.put('#',  24); map.put('$',  29); map.put('%',  22);
        map.put('&',  24); map.put('\'',  3); map.put('(',  12); map.put(')',  12); map.put('*',  17); map.put('+',  13);
        map.put(',',   7); map.put('-',   7); map.put('.',   4); map.put('/',  10); map.put('0',  22); map.put('1',  19);
        map.put('2',  22); map.put('3',  23); map.put('4',  21); map.put('5',  27); map.put('6',  26); map.put('7',  16);
        map.put('8',  23); map.put('9',  26); map.put(':',   8); map.put(';',  11); map.put('<',  10); map.put('=',  14);
        map.put('>',  10); map.put('?',  15); map.put('@',  32); map.put('A',  24); map.put('B',  29); map.put('C',  20);
        map.put('D',  26); map.put('E',  26); map.put('F',  20); map.put('G',  25); map.put('H',  25); map.put('I',  18);
        map.put('J',  18); map.put('K',  21); map.put('L',  16); map.put('M',  28); map.put('N',  25); map.put('O',  26);
        map.put('P',  23); map.put('Q',  31); map.put('R',  28); map.put('S',  25); map.put('T',  16); map.put('U',  23);
        map.put('V',  19); map.put('W',  26); map.put('X',  18); map.put('Y',  14); map.put('Z',  22); map.put('[',  18);
        map.put('\\', 10); map.put(']',  18); map.put('^',   7); map.put('_',   8); map.put('`',   3); map.put('a',  23);
        map.put('b',  25); map.put('c',  17); map.put('d',  25); map.put('e',  23); map.put('f',  18); map.put('g',  30);
        map.put('h',  21); map.put('i',  15); map.put('j',  20); map.put('k',  21); map.put('l',  16); map.put('m',  22);
        map.put('n',  18); map.put('o',  20); map.put('p',  25); map.put('q',  25); map.put('r',  13); map.put('s',  21);
        map.put('t',  17); map.put('u',  17); map.put('v',  13); map.put('w',  19); map.put('x',  13); map.put('y',  24);
        map.put('z',  19); map.put('{',  18); map.put('|',  12); map.put('}',  18); map.put('~',   9);
        for (int indexLine = 0; indexLine < Line.length(); indexLine++) {
            if (map.containsKey(Line.charAt(indexLine))) {
                sumOfToner += map.get(Line.charAt(indexLine));
            }
            if (!map.containsKey(Line.charAt(indexLine))) {
                sumOfToner += 23;
            }
        }
        return sumOfToner;
    }
}
