package mindustry.gen;

import arc.audio.Music;

public class Musics {
  public static Music editor = new arc.mock.MockMusic();

  public static Music game1 = new arc.mock.MockMusic();

  public static Music game2 = new arc.mock.MockMusic();

  public static Music game3 = new arc.mock.MockMusic();

  public static Music game4 = new arc.mock.MockMusic();

  public static Music game5 = new arc.mock.MockMusic();

  public static Music game6 = new arc.mock.MockMusic();

  public static Music game7 = new arc.mock.MockMusic();

  public static Music launch = new arc.mock.MockMusic();

  public static Music menu = new arc.mock.MockMusic();

  public static void load() {
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/editor.ogg" : "music/editor.mp3", arc.audio.Music.class).loaded = a -> editor = (arc.audio.Music)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game1.ogg" : "music/game1.mp3", arc.audio.Music.class).loaded = a -> game1 = (arc.audio.Music)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game2.ogg" : "music/game2.mp3", arc.audio.Music.class).loaded = a -> game2 = (arc.audio.Music)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game3.ogg" : "music/game3.mp3", arc.audio.Music.class).loaded = a -> game3 = (arc.audio.Music)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game4.ogg" : "music/game4.mp3", arc.audio.Music.class).loaded = a -> game4 = (arc.audio.Music)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game5.ogg" : "music/game5.mp3", arc.audio.Music.class).loaded = a -> game5 = (arc.audio.Music)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game6.ogg" : "music/game6.mp3", arc.audio.Music.class).loaded = a -> game6 = (arc.audio.Music)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game7.ogg" : "music/game7.mp3", arc.audio.Music.class).loaded = a -> game7 = (arc.audio.Music)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/launch.ogg" : "music/launch.mp3", arc.audio.Music.class).loaded = a -> launch = (arc.audio.Music)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/menu.ogg" : "music/menu.mp3", arc.audio.Music.class).loaded = a -> menu = (arc.audio.Music)a;
  }

  public static void dispose() {
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/editor.ogg" : "music/editor.mp3");
    editor = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game1.ogg" : "music/game1.mp3");
    game1 = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game2.ogg" : "music/game2.mp3");
    game2 = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game3.ogg" : "music/game3.mp3");
    game3 = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game4.ogg" : "music/game4.mp3");
    game4 = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game5.ogg" : "music/game5.mp3");
    game5 = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game6.ogg" : "music/game6.mp3");
    game6 = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/game7.ogg" : "music/game7.mp3");
    game7 = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/launch.ogg" : "music/launch.mp3");
    launch = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "music/menu.ogg" : "music/menu.mp3");
    menu = null;
  }
}
