package id_c5b7ce60bf5c77af02586d7614010e80;

public class AlwaysMinCompetitor extends AbstractCompetitor
{
    @Override
    public double declareDonationTo(Competitor c)
    {
        return 0.0;
    }

    @Override
    public void informDonationFrom(Competitor c, double donation)
    {
    }
}