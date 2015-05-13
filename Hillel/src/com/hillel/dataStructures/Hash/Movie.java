package com.hillel.dataStructures.Hash;

/**
 * Created by A.Nikitiuk on 13.05.2015.
 */
public class Movie {
    private int year;
    private String name;
    private long budget;

    public Movie(int year, String name, long budget) {
        this.year = year;
        this.name = name;
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (year != movie.year) return false;
        if (budget != movie.budget) return false;
        return name.equals(movie.name);

    }

    @Override
    public String toString() {
        return "Movie{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", budget=" + budget +
                '}';
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + name.hashCode();
        result = 31 * result + (int) (budget ^ (budget >>> 32));
        return result;
    }

   /*@Override
    public boolean equals(Object obj){
        if(!(obj instanceof Movie)){
            return false;
        }
        Movie other = (Movie) obj;
        return this.year == other.year && name.equals(other.name);
    }

    @Override
    public int hashCode(){
        return year + name.hashCode();
    }*/
}
