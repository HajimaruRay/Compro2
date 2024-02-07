class LectRoom1
{
    int classCode, capacity, currentSeats;
    String name;
    LectRoom1 (int classCode, String name, int capacity)
    {
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;
    }

    boolean reserveSeats(int currentSeats)
    {
        if (currentSeats > capacity)
        {
            return false;
        }
        else
        {
            this.currentSeats += currentSeats;
            capacity -= currentSeats;
            return true;
        }
    }
}

class LactureRoom2
{
    
}
