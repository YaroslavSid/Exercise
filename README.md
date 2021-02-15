## Major Issues  
1. The `parent_id` column have not to link to the same entity (for all files).
2. in *entity.csv* there is `has_type_id` column that have to link entity to the
   type, which have to exist in *type.csv*.
3. All import data linked with each other, so there is almost no case when there
   will be need to generate the only file. There is no way to put real-existing
   numbers in columns that are external keys in fact as well. In such a way remake
   the way of creating files (generate all of them at once).


### Minor issues
1. Make `code` column to be string and put the probably something that more
   similar to `name` column.
2. Add labels to *entity.csv* that are strings. It will be nice in the future.


#### Improvements
1. Make a separate application for the generator. Use `maven` for new project.
2. Use dictionary for random words. May take *words.txt* in project root. May use
   services for generating dictionaries (http://app.aspell.net/create?defaults=en_US).
3. Insert several "known" lines in each file. It means hardcode several lines everyone
   will know they exist in the database. May use words from *words.txt*.