/**
 * Created by devon on 31/01/2015.
 */
public class SampleableListImpI implements SampleableList {

    public SampleableList sample() {


        SampleableList a = new SampleableListImpI();

        if (isEmpty() || size()-1 >=4) {

        }


        for (int i = 0; i < size(); i++) {
            if (i == 0) {
                Object b = get(i);
                a.add(b);
            }


            if (i == 2) {
                Object b = get(i).getReturnValue();
                a.add(b);

            }

                if (i == 4) {
                    Object b = get(i).getReturnValue();
                    a.add(b);

                }

            }


        return a;
    }

    }