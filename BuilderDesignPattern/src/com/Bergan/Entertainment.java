package com.Bergan;

public class Entertainment {

    private String webSeries;
    private String movies;
    private String game;
    private int memberfees;

    public Entertainment(Builder builder) {
        this.webSeries=builder.webSeries;
        this.movies=builder.movies;
        this.game=builder.game;
        this.memberfees=builder.memberfees;
    }


    static class Builder{
        private String webSeries;
        private String movies;
        private String game;
        private int memberfees;

        public Entertainment build(){
            return new Entertainment(this);

        }


        public  Builder(int memberfees)
        {
            this.memberfees=memberfees;
        }

        public Builder webSeries(String webSeries)
        {
            this.webSeries=webSeries;
            return this;
        }
        public Builder movies(String movies)
        {
            this.movies=movies;
            return this;
        }

        public Builder game(String game)
        {
            this.game=game;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Entertainment{" +
                "webSeries='" + webSeries + '\'' +
                ", movies='" + movies + '\'' +
                ", game='" + game + '\'' +
                ", memberfees=" + memberfees +
                '}';
    }
}
