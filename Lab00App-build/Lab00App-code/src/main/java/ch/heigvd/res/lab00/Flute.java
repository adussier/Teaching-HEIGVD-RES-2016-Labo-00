package ch.heigvd.res.lab00;

/**
 *
 * @author Amel Dussier
 */
public class Flute implements IInstrument {

    @Override
    public String play() {
        return "trilili";
    }

    @Override
    public int getSoundVolume() {
        return 5;
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
