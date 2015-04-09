public class Person
{
  private String name;
  private String friends;

  public Person(String aName, String pictureFile, int xCoord, int yCoord)
  {
    name = aName;
    friends = "";
    Picture picture = new Picture(pictureFile);
    picture.translate(xCoord, yCoord);
    picture.draw();
  }

  public String getFriends()
  {
    return friends;
  }

  public void addFriend(Person friend)
  {
    friends = friends + " " + friend.name;
  }

  public void unfriend(Person nonFriend)
  {
    friends = friends.replace(" " + nonFriend.name, "");
  }
}
