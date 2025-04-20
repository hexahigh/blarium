# How to add music discs

## Notes:
- All resource files related to the disc should share the same name
- The names of the resource files should be all lowercase
- Both sound and item names should be prefixed with `disc_`

## Steps:

1. **Create the audio file**  
   The first thing you need to do is create the audio file. It must be:
   - Using the Vorbis codec
   - Stored in a `.ogg` container
   - Mono
   - Only contain an audio stream (no cover-art)

2. **Place the audio file**  
   Place the audio file in `src/main/resources/assets/blarium/sounds/records/` and call it `disc_song_name.ogg` (No spaces, all lowercase).

3. **Add the song to `sounds.json`**  
   Add the song to `src/main/resources/assets/blarium/sounds.json`. Here you are linking the audio file to an ID. Example:

   ```json
   "disc_song_name": {
       "sounds": [
           {
               "name": "blarium:records/disc_song_name",
               "stream": true
           }
       ]
   }
   ```

4. **Add the song title and artist to `en_us.json`**  
   Add the song title and artist to `src/main/resources/assets/blarium/lang/en_us.json`. Use existing discs as an example. Example:

   ```json
   "item.blarium.disc_song_name": "Music Disc - Song Name",
   "item.blarium.disc_song_name.desc": "Artist Name"
   ```

5. **Add the jukebox song JSON**  
    Create a JSON file for the new disc in `src/main/resources/data/blarium/jukebox_song/`. The file name should match the disc ID (e.g., `disc_song_name.json`). Example:

    ```json
    {
      "comparator_output": 15,
      "description": {
        "translate": "item.blarium.disc_song_name.desc"
      },
      "length_in_seconds": 275.0,
      "sound_event": "blarium:disc_song_name"
    }
    ```

    Replace `275.0` with the actual length of the song in seconds and ensure the `sound_event` matches the sound ID defined in `sounds.json`.

6. **Add a texture**  
   Add a texture with the same name as the audio file into `src/main/resources/assets/blarium/textures/item/`. This texture will be used for the disc item.

7. **Add the sound to `ModSounds.java`**  
   Register the sound event and its corresponding `RegistryKey` for the jukebox song in `ModSounds.java`. Example:

   ```java
   public static final SoundEvent DISC_SONG_NAME = registerSoundEvent("disc_song_name");

   public static final RegistryKey<JukeboxSong> DISC_SONG_NAME_KEY =
           RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_song_name"));
   ```

8. **Add the disc to `ModItems.java`**  
   Register the new disc item with the sound key in `ModItems.java`. Example:

   ```java
   public static final Item DISC_SONG_NAME = registerDisc("disc_song_name", ModSounds.DISC_SONG_NAME_KEY);
   ```

9. **Add the disc to `ModItemGroups.java`**  
   Include the new disc in the `BLARIUM` item group in `ModItemGroups.java`. Example:

   ```java
   entries.add(ModItems.DISC_SONG_NAME);
   ```

10. **Add the disc to `ModModelProvider.java`**  
   Generate the item model for the new disc in `ModModelProvider.java`. Example:

   ```java
   itemModelGenerator.register(ModItems.DISC_SONG_NAME, Models.GENERATED);
   ```

11. **Add the disc to `ModItemTagProvider.java`**  
    Add the new disc to the `CREEPER_DROP_MUSIC_DISCS` tag in `ModItemTagProvider.java`. Example:

    ```java
    getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
            .add(ModItems.DISC_SONG_NAME);
    ```

12. **Test the disc**  
    Launch the game and ensure the disc works as expected. Verify the following:
    - The disc appears in the creative inventory under the `BLARIUM` tab.
    - The disc plays the correct song when inserted into a jukebox.
    - The comparator output matches the value specified in the JSON file.
    - The texture and translations are correct.