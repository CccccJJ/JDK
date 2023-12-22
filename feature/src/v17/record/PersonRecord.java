package v17.record;

public record PersonRecord(String name, Integer age) {

    public PersonRecord {
        if(age > 18){
            throw new IllegalArgumentException("age cant not > 18");
        }
    }

}
