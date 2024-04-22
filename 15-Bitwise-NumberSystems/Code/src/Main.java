public class Main {
    public static void main(String[] args) {
        /*
          Bit Manipulation:-
            Operators:-
                1- AND(&) - Both needs to be TRUE
                ( NOTE:- When we AND 1 with any Number, Digits remain the same!!
                EX:- 1 1 0 0 1 0 1 0 0
                     1 1 1 1 1 1 1 1 1
                    ------------------------
                     1 1 0 0 1 0 1 0 0  )
                ----------------------------------------------------------------------

                2 - OR(|) - Anyone needs to be TRUE
                ----------------------------------------------------------------------

                3 - XOR (^) Exclusive OR (If and only if) - Only ONE should be TRUE i.e.
                     returns true (1) if the number of true inputs is odd, and false (0) if it's even.
                     (
                        NOTE:- When we XOR any number(suppose - a) with 1 we get complement of Number(a) i.e. Opposite
                               When we XOR any number(suppose - a) with 0 we get same Number(a)
                               When we XOR any number(suppose - a) with same Number we get same 0
                     )
                ----------------------------------------------------------------------

                4 - Compliment Operator - Opposite of a Number
                ----------------------------------------------------------------------

                5 - Left Shift Operator (<<)
                    10 << 1 -> (1010) << 1
                    10100 -> 20
                    ( NOTE :- a << 1 = 2a )
                    (Note2:- a << b = a * 2^b)
                ----------------------------------------------------------------------

               6 - Right Shift Operator (>>)
                    0011001 >> 1 -> 0001100 (Extra 1 in the beginning gets discarded and 0 is added to the leftover space)
                    ( NOTE:- a >> 1 = a/2)
                    (Note2:- a >> b = a / 2^b)
                    

         */

        /*
            Number Systems-
                1 - Decimal -> 0,1,2,3,4,5,,6,7,8,9 (Base - 10)
                Representation -
                    Ex- 357 = (357)Base10
                ----------------------------------------------------------------------
                2 - Binary -> 0,1 (Base - 2)
                  Representation -
                    Ex- 10 = (1010)Base2
                ----------------------------------------------------------------------
                3 - Octal -> 0,1,2,3,4,5,6,7 (Base - 8)
                  Representation -
                    0,1,2,3,4,5,6,7,10,11,12,13,14,15,16,17,20
                    8(Base10) = 10(Base8)
                ----------------------------------------------------------------------
                4 - Hexa-Decimal -> 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F (BASE - 16)
                  Representation -
                    0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
                    10(Base10) = A(Base16)

         */

        /*
            Conversion:-
            1- Decimal to  Base b
              KEEP DIVIDING BY BASE, TAKE REMAINDERS WRITE IN OPPOSITE (L.C.M)

            2 - Base b to Decimal
              MULTIPLY & ADD THE POWER OF BASE WITH DIGITS (From Right side) (Power of Every digit with Base starts from 0)
              (10001)Base2 = (?)Base10
               1*2^4 + 0*2^3 + 0*2^2 + 0*2^1 + 1*2^0 = 17(Base 10)

               (21)Base8 = (?)Base10
               2*8^1 + 1*8^0 = 17
         */

        /*
            Bit-masking is the act of applying a mask over a value to keep, change or modify a piece of given information.
         */

        /*
            1st bit is the most significant bit (The first bit signifies if a Number is +ve or -ve)
            Last bit is the least significant bit

            -ve Numbers in binary system are stored in 2's Compliment method
            Steps to get a -ve number in binary
            1 - Compliment every bit
            2 - Add 1 to it
         */

        /*
            Range Formula:- for n bits, as First bit is used for +ve or -ve
            -2^n-1 to 2^n-1 - 1
         */

    }
}