package com.tamucc.police;

import java.io.File;

import android.os.Environment;

public final class IslandWatch_iCORE_TAMUCC_BaseAlbumDirFactory extends IslandWatch_iCORE_TAMUCC_AlbumStorageDirFactory {

	// Standard storage location for digital camera files
	private static final String CAMERA_DIR = "/dcim/";

	@Override
	public File getAlbumStorageDir(String albumName) {
		return new File (
				Environment.getExternalStorageDirectory()
				+ CAMERA_DIR
				+ albumName
		);
	}
}
