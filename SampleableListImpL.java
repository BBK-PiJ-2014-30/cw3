/**
 * Created by devon on 31/01/2015.
 */
public class SampleableListImpL implements SampleableList {

    public SampleableList sample() {


        SampleableList a = new SampleableListImpL();

        if (isEmpty() || size()-1 >=4) {
            return a;
        }


        for (int i = 0; i < size() - 1; i++) {
            if (i == 0) {
                Object b = get(i);
                a.add(b);
            }


            else if (i == 2) {
                Object b = get(i);
                a.add(b);

            }
            else {
                if (i == 4) {
                    Object b = get(i);
                    a.add(b);

                }
            }




        return a;
    }
    }