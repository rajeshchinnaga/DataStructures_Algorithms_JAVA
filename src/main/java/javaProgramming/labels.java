package javaProgramming;

public class labels {

    public static void main(String[] args){

        first:{

            second:{

                third:{

                    for(int i=0;i<10;i++){
                        for(int j=0;j<10;j++){
                            if(j==2){
                                break second ;
                            }
                            System.out.println("Third Label");
                        }
                    }


                }
                System.out.println("Second Label");
            }

            System.out.println("First Label'");
        }

    }
}
