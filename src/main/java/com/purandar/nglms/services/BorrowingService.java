package com.purandar.nglms.services;

import com.purandar.nglms.model.Borrowing;

public interface BorrowingService {

	Borrowing borrowBook(Long bookId, Long memberId);

	Borrowing returnBook(Long borrowingId);

}
