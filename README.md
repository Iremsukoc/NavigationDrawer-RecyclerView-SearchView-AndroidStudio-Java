# NavigationDrawer-RecyclerView-SearchView-AndroidStudio-Java
In this project, an application supported by a toolbar that lists movies and includes a search feature in these movies was developed. Features used:
- Navigation Drawer
- Recycler View
- Search View


### Navigation Drawer
- In this project, a horizontal navigation drawer (toolbar) was developed.
- When the project was first opened, the icons seen at the top of the home page were defined in the file in the menu directory.
- Typically, these elements are specified with a name, an icon, and an ID. This method is a common approach used to organize the content of the navigation drawer and facilitate user navigation within the application. 
- Items that do not appear in the toolbar are displayed when you press the area indicated by 3 dots.

</br> </br> 

<table>
  <tr>
    <td><img src="app/src/main/res/AppImages/toolbar_image.png" style="width: 500px; height: 700px;"></td>
    <td><img src="app/src/main/res/AppImages/toolbar_image2.png" style="width: 500px; height: 700px;"></td>
  </tr>
</table>

</br> 
- Related components: toolbar_menu, activity_main, MainActivity


</br> </br> 

### Recycler View
- When opened in Mainactivity, movies are listed with their names, posters and directors.
- Vertical recycler view was used.  </br></br>


<p align="center">
  <img src = "app/src/main/res/AppImages/recyclerView_image.png" witdh="500" height="700">
</p>  

</br> 
- Related components: movie_item_list, activity_main, MovieData, MovieAdapter, MainActivity



</br> </br> 

### Search View
- When the search icon is pressed, the list is instantly refreshed as words or letters are typed in the search box, and the appropriate ones are listed in the recycler view.  </br> </br>

<p align="center">
  <img src = "app/src/main/res/AppImages/searchView_image.png" witdh="500" height="700">
</p> 

</br> 
- Related components: activity_main, MainActivity , MovieAdapter


  
