import java.util.Objects;

class MyObject {
    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public boolean equals(final Object other) {     //my instance of MyObject
        if (!(other instanceof MyObject)) {         //but MyObject isn't instance of child
            return false;
        }
        MyObject castOther = (MyObject) other;
        return Objects.equals(field, castOther.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
}
