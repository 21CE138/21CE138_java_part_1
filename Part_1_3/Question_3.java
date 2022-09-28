package Part_1_3;

public class Question_3 {
        private int first_no;
        private int second_no;
        public void Last_Digit(int first_no,int second_no)
        {
            int c,d;
            if(first_no>10 && second_no>10)
            {
                c = first_no%10;
                d = second_no%10;
                if(c==d)
                {
                    System.out.println("true");
                }
                else
                {
                    System.out.println("false");
                }
            }
            else if(second_no>10)
            {

                d = second_no%10;
                if(first_no==d)
                {
                    System.out.println("true");
                }
                else
                {
                    System.out.println("false");
                }
            }
            else if(first_no>10)
            {
                c = first_no%10;
                if(c==second_no)
                {
                    System.out.println("true");
                }
                else
                {
                    System.out.println("false");
                }
            }
        }
        public int getFirst_no() {
        return first_no;
    }

        public void setFirst_no(int first_no) {
        this.first_no = first_no;
    }

        public int getSecond_no() {
        return second_no;
    }

        public void setSecond_no(int second_no) {
        this.second_no = second_no;
    }

    }
